package Workflow;
/*3.10 Workﬂow Soit le ﬂux de documents suivant : La tâche CHECK reçoit des documents et vériﬁe leur conformité. Si le
document est conforme, il est conﬁé à la tâche DISPATCH, sinon à la tâche TRASH. La tâche DISPATCH envoie le document
vers les tâches BILL, SEND ou ORDER selon l’indication
15
présente dans le document dans le champ STATUS (choix exclusif). La tâche ORDER envoie pour chaque document reçu un
document à SEND et BILL. Lorsque ces deux tâches ont terminé de traiter 2 documents apparentés, la tâche BACKUP écrit
dans un ﬁchier qu’un document a été traité.

    — Écrivez le programme Java qui simule ce workﬂow avec des threads, chaque
    tâche étant exécutée par une même personne qui ne peut traiter qu’un document à la fois.

    — Y a-t-il un risque qu’une
    tâche ne traite jamais un document? Si oui, corrigez votre solution.

    — Peut-on fournir une estimation de la borne
    supérieure de la taille mémoire (ram, disque, peu importe) nécessaire à toute exécution de ce type de workﬂow?

    — Peut-on concevoir une architecture plus générique dont les composants peuvent être réutilisés pour d’autres énoncés
    de ce type. — Comment qualiﬁeriez-vous le style de votre architecture?
*/

/**
 *
 * @author UNamur
 *
 */
public class ExeWorkflow {

    public static void main(String[] args) {
        int nbrDocuments;

        if (args == null || args.length != 2) {
            System.err
                    .println("Usage: <delay> <nbrdocuments>\n" + "\t<delay>:\tnumber of seconds between each process\n"
                            + "\t<nbrdocuments>:\tnumber of documents generated\n"
                            + "\tdefault values are 1 (seconds) 5 (documents)");
            args = new String[] { "1", "5" };
        }
        try {
            Document.setSpeed(Integer.parseInt(args[0]));
            nbrDocuments = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.err
                    .println("Usage: <delay> <nbrdocuments>\n" + "\t<delay>:\tnumber of seconds between each process\n"
                            + "\t<nbrdocuments>:\tnumber of documents generated\n"
                            + "\tdefault values are 1 (seconds) 5 (documents)");
            Document.setSpeed(1);
            nbrDocuments = 5;
        }

        SharedQueue<Document> queueBeforeCheck = new SharedQueue<>();
        SharedQueue<Document> queueBeforeDispatch = new SharedQueue<>();
        SharedQueue<Document> queueBeforeBill = new SharedQueue<>();
        SharedQueue<Document> queueBeforeSend = new SharedQueue<>();
        SharedQueue<Document> queueBeforeOrder = new SharedQueue<>();
        SharedQueue<Document> queueBeforeTrash = new SharedQueue<>();
        SharedQueue<Document> queueAfterBill = new SharedQueue<>();
        SharedQueue<Document> queueAfterSend = new SharedQueue<>();

        new TaskCheck(make(queueBeforeCheck), make(queueBeforeDispatch, queueBeforeTrash)).start();
        new TaskDispatch(make(queueBeforeDispatch), make(queueBeforeOrder, queueBeforeSend, queueBeforeBill)).start();
        new TaskBill(make(queueBeforeBill), make(queueAfterBill)).start();
        new TaskSend(make(queueBeforeSend), make(queueAfterSend)).start();
        new TaskOrder(make(queueBeforeOrder), make(queueBeforeSend, queueBeforeBill)).start();
        new TaskTrash(make(queueBeforeTrash), make()).start();
        new TaskBackup(make(queueAfterBill, queueAfterSend), make()).start();

        for (int i = 0; i < nbrDocuments; i++) {
            queueBeforeCheck.add(new Document());
        }

    }

    /**
     *
     *
     * Utilities to bypass a limitation of Java
     * see https://stackoverflow.com/questions/14917375/cannot-create-generic-array-of-how-to-create-an-array-of-mapstring-obje/14917529
     *
     *
     */

    @SuppressWarnings("unchecked")
    private static SharedQueue<Document>[] make() {
        return (SharedQueue<Document>[]) new SharedQueue[] {};
    }

    @SuppressWarnings("unchecked")
    private static SharedQueue<Document>[] make(SharedQueue<Document> a) {
        return (SharedQueue<Document>[]) (new SharedQueue[] { a });
    }

    @SuppressWarnings("unchecked")
    private static SharedQueue<Document>[] make(SharedQueue<Document> a, SharedQueue<Document> b) {
        return (SharedQueue<Document>[]) new SharedQueue[] { a, b };
    }

    @SuppressWarnings({ "unchecked" })
    private static SharedQueue<Document>[] make(SharedQueue<Document> a, SharedQueue<Document> b,
                                                SharedQueue<Document> c) {
        return (SharedQueue<Document>[]) new SharedQueue[] { a, b, c };
    }


}