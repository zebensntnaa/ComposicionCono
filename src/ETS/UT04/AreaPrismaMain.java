package ETS.UT04;

import java.util.ArrayList;

public class AreaPrismaMain {
    public static void main(String[] args) {

        ArrayList<Prisma> listaPrisma = new ArrayList<>();

        for (int i = 0; i<3; i++){
            Prisma prisma = new Prisma();
            prisma.setAlturaPrisma(prisma.valores());
            prisma.setBaseTriangulo(prisma.valores());
            prisma.setAlturaTriangulo(prisma.alturaTriangulo());
            prisma.setAreaBase(prisma.areaBase());
            prisma.setAreaLateral(prisma.areaLateral());
            prisma.setPerimetro(prisma.perimetro());
            listaPrisma.add(prisma);
        }

        System.out.print("--------------------------------\n"
        +"     CREACION DE LOS PRISMAS"+"\n--------------------------------\n");

        for (int i = 0; i< listaPrisma.size(); i++){
            System.out.println("\n Prisma número "+(i+1)+"º");
            System.out.print("   -Base: "+listaPrisma.get(i).getBaseTriangulo()+"\n");
            System.out.print("   -Altura: "+listaPrisma.get(i).getAlturaPrisma()+"\n");
            System.out.print("   -Area total: "+listaPrisma.get(i).areaTotal()+"\n");
        }

        System.out.print("\n Ordenados de mayor a menor \n");

    }
}
