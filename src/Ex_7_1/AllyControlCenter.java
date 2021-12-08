package Ex_7_1;

import java.util.ArrayList;

public abstract class AllyControlCenter {

    protected String allyName;
    protected ArrayList<IObserver> players = new ArrayList<>();


    public void join(IObserver obs){
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    public void quit(IObserver obs){
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    public abstract void notifyObserver(String name);
}
