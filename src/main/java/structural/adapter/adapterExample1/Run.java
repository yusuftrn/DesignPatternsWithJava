package structural.adapter.adapterExample1;

import structural.adapter.adapterExample1.adapters.SquarePegAdapter;
import structural.adapter.adapterExample1.round.RoundHole;
import structural.adapter.adapterExample1.round.RoundPeg;
import structural.adapter.adapterExample1.square.SquarePeg;

public class Run {

    public static void main(String[] args){

        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(roundHole.isFit(roundPeg)){
            System.out.println("roundPeg r=5 fits roundHole r=5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        //hole.fits(smallSqPeg); !Won't compile.

        //Adapter solves the problem:
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if(roundHole.isFit(smallSqPegAdapter)){
            System.out.println("smallSqPeg w=2 fits roundHole r=5");
        }
        if(!roundHole.isFit(largeSqPegAdapter)){
            System.out.println("smallSqPeg w=20 doesn't fit into roundHole r=5");
        }
    }
}
