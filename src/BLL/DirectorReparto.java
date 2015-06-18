
package BLL;

public class DirectorReparto 
{
    private int codReparto;
    private int codDirector;

    public DirectorReparto() {
    }

    public DirectorReparto(int codReparto, int codDirector) {
        this.codReparto = codReparto;
        this.codDirector = codDirector;
    }

    public int getCodReparto() {
        return codReparto;
    }

    public void setCodReparto(int codReparto) {
        this.codReparto = codReparto;
    }

    public int getCodDirector() {
        return codDirector;
    }

    public void setCodDirector(int codDirector) {
        this.codDirector = codDirector;
    }
}
