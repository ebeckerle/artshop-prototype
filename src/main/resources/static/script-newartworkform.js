function autoFillProductName(){
    let existingProduct1Name = document.getElementById("product1Name").placeholder;
    let arrayProduct1Name = existingProduct1Name.split(" - ");
    let existingArtworkName = arrayProduct1Name[0];
    let existingProductType = arrayProduct1Name[1];

    let artworkNameInput = document.getElementById("artworkName").value;
    if(artworkNameInput !== "" && artworkNameInput !== " "){
        document.getElementById("product1Name").placeholder = artworkNameInput + " - " + existingProductType;
    }
    let product1TypeSelectedOption = document.getElementById("product1Type").value;
    if(product1TypeSelectedOption !== ""){
        document.getElementById("product1Name").placeholder = existingArtworkName + " - " + product1TypeSelectedOption;
    }
    let product1NewType = document.getElementById("product1NewType").value;
    if(product1NewType !== "" && product1NewType !== " "){
        console.log(product1NewType);
        document.getElementById("product1Name").placeholder = existingArtworkName + " - " + product1NewType;
    }
}

function acceptPlaceholderAsValue(){
    let existingProduct1Name = document.getElementById("product1Name").placeholder;
    if(existingProduct1Name !== "Artwork Name - Product Type"){
        document.getElementById("product1Name").value = existingProduct1Name;
    }

}