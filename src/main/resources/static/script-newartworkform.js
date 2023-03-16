function autoFillProductName(){
    let existingProduct1Name = document.getElementById("product1Name").placeholder;
    let existingArtworkName;
    let existingProductType
    //if artworkName
    let artworkName = document.getElementById("artworkName").value;
    console.log(typeof artworkName);
    if(artworkName != "" || artworkName != " "){
        document.getElementById("product1Name").placeholder = artworkName + " - Product Type";
    }


    let product1NewType = document.getElementById("product1NewType").value;
    if(product1NewType != "" && product1NewType != " "){
        console.log(product1NewType);
    }

}