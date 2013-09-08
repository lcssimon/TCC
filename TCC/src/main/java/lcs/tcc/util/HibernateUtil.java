
package lcs.tcc.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;
    
   public static final String HIBERNATE_SESSION = "hibernate_session";
   private static final ServiceRegistry serviceRegistry;
   static{
       try {
           System.out.println("Tentando configurar a SF");
            
            Configuration configuration = new Configuration().configure();
            
             serviceRegistry = new ServiceRegistryBuilder().
                applySettings(configuration.getProperties()).buildServiceRegistry();
            
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            
            System.out.println("Session factory criada corretamente");
        } catch (Exception ex) {
            System.out.println("Erro na conexao"+ex);
            throw  new ExceptionInInitializerError(ex);
            
       }       
   
   }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
