package interfaces;

public class CustomerManager {
	private Logger[] loggers;
    public CustomerManager(Logger[] loggers) {
        //super();
        this.loggers = loggers;
    }
    //loosly-tightly coupled
    public void add(Customer customer)
    {
        System.out.println("M��teri eklendi "+customer.getFirstname());
        /*for(Logger logger:loggers)
        {
            logger.log(customer.getFirstname());
        }*/
        Utils.runLoggers(loggers, customer.getFirstname());//�stteki for yerine kulland�k

        //this.loggers.log(customer.getFirstname());
        /*DataBaseLogger logger=new DataBaseLogger();
        logger.log(customer.getFirstname() + "veri taban�na logland�");*/
    }
    public void delete(Customer customer)
    {
        System.out.println("M��teri silindi "+customer.getFirstname());

        /*for(Logger logger:loggers)
        {
            logger.log(customer.getFirstname());
        }*/
        Utils.runLoggers(loggers, customer.getFirstname());        
        //this.logger.log(customer.getFirstname());

        /*DataBaseLogger logger=new DataBaseLogger();
        logger.log(customer.getFirstname()+"veri taban�na logland�");*/

    }

}
