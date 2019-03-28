package kelas.xirpl.objek;

class Artis {
private String nama;
private int umur;
private String film;

public void setNama(String namaArtisnya){
this.nama=namaArtisnya;
}
public void setUmur(int umurArtisnya){
this.umur=umurArtisnya;
}
public void setFilm(String filmArtisnya){
this.film=filmArtisnya;
}
public void sebutIdentitas(){
System.out.println("Nama : "+nama);
System.out.println("Umur : "+umur);
System.out.println("Film : "+film);
}
}

