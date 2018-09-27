package cn.test;

/**
 * �����˻�
 * @author ���
 *
 */
public class Account {
    private double balance;     // �˻����
 
    /**
     * ���
     * @param money ������
     */
   synchronized public void deposit(double money) {
        double newBalance = balance + money;
        try {
            Thread.sleep(10);   // ģ���ҵ����Ҫһ�δ���ʱ��
        }
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        balance = newBalance;
    }
 
    /**
     * ����˻����
     */
    public double getBalance() {
        return balance;
    }
}
