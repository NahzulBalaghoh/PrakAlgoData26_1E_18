package P3;
public class dataDosen18 {

    public void dataSemuaDosen (dosen18[] arrayOfDosen){
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-"+(i+1));
            arrayOfDosen[i].tmplData();
        }
    }

    public void jumlahDosenPerJenisKelamin(dosen18[] arrayOfDosen){
        int pria = 0, wanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                wanita++;
            }else{
                pria++;
            }
        }
        System.out.println("Jumlah Dosen Wanita: "+wanita);
        System.out.println("Jumlah Dosen Pria: "+pria);
        System.out.println("-----------------------------");
    }
    
    public void rerataUsiaDosenPerJenisKelamin( dosen18[] arrayOfDosen){
        int totPria =0, totWanita =0, jmlPria=0, jmlWanita=0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totWanita += arrayOfDosen[i].usia;
                jmlWanita++;
            }else{
                totPria += arrayOfDosen[i].usia;
                jmlPria++;
            }
        }
        System.out.println("Rata rata usia wanita: " + (jmlWanita >0 ? (double) totWanita/jmlWanita : 0));
        System.out.println("rata rata usia pria: "+(jmlPria >0 ? (double) totPria/jmlPria : 0));
        System.out.println("-------------------------------------");
    }

    public void infoDosenPalingTua(dosen18[] arrayOfDosen) {
        int index = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > arrayOfDosen[index].usia) {
                index=i;
            }
        }
        System.out.println("Dosen paling tua: ");
        arrayOfDosen[index].tmplData();
    }

    public void infoDosenPalingMuda (dosen18[] arrayOfDosen){
        int index = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < arrayOfDosen[index].usia) {
                index=i;
            }
        }
        System.out.println("Dosen paling muda: ");
        arrayOfDosen[index].tmplData();
    }
}