import Tender.Ask;
import Tender.Tender;
import callcenter.CallCenter;
import callcenter.Client;
import callcenter.Operator;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.logging.Logger;
public class Main {
    private static final Logger LOG = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws InterruptedException {
        
        LOG.info("Starting program");
        LOG.info("Task 1");

        final  int NUMBER_OF_OPERATORS = 3;
        final  int NUMBER_OF_CLIENTS = 5;
        ArrayList<Operator> operators = new ArrayList<>();
        for (int i = 1; i <= NUMBER_OF_OPERATORS; i++) {
            operators.add(new Operator(i));
        }

        CallCenter callCenter = new CallCenter(operators);
        for (int i = 1; i <= NUMBER_OF_CLIENTS; i++) {
            Thread thread = new Thread(new Client(callCenter, i));
            thread.start();
        }

/*
        LOG.info("Task 2");
        Tender tender = new Tender();
        for (int i = 0; i < tender.NUMBER_ASK; i++) {
            Ask thread = new Ask(i, tender.getBarrier());
            tender.addAsk(thread);
            thread.start();
            Thread.sleep(new Random().nextInt(1000) + 2000);
        }
        */
        LOG.info("End of program");
    }
}