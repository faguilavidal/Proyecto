
package BLL;

public class ActorReparto 
{
    private int codReparto;
    private int codActor;

    public ActorReparto() {
    }

    public ActorReparto(int codReparto, int codActor) {
        this.codReparto = codReparto;
        this.codActor = codActor;
    }

    public int getCodReparto() {
        return codReparto;
    }

    public void setCodReparto(int codReparto) {
        this.codReparto = codReparto;
    }

    public int getCodActor() {
        return codActor;
    }

    public void setCodActor(int codActor) {
        this.codActor = codActor;
    }
}
