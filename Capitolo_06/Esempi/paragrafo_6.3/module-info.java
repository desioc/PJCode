// NON COMPILA (esempio)

module ModuloUno {
    export package1; // rende accessibile package1 a tutti gli altri moduli
    export package2 to ModuloDue; // rende accessibile package2 solo a ModuloDue
    requires ModuloTre;	// richiede l’accesso ai package esportati da ModuloTre
}
