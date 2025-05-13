void main() {
    double orale = 30;
    double scritto = 26;
    double laboratorio = 29;

    double media = orale * 0.2 + scritto * 0.5 + laboratorio * 0.3;
    int mediaArrotondata = (int) Math.round(media);

    println("Media finale: " + mediaArrotondata);
}