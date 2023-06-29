var title = document.getElementById("topicTt1");
var desc = document.getElementById("topicDescript");
var imgContent = [
    ["imgOption1", "BOM", "Lorem ipsum dolor sit amet."],
    ["imgOption2", "DOM", "Nullam fringilla imperdiet eleifend"],
    ["imgOption3", "JavaScript", "Cras dapibus ipsum a consequat tincidunt"]
];
function previewImg(imgSrc){
    document.getElementById("imgViewer").src = imgSrc.src;
    for(var imgCount=0; imgCount<imgContent.length; imgCount++){
        if(imgContent[imgCount][0] == imgSrc.id){
            title.innerHTML = imgContent[imgCount][1];
            desc.innerHTML = imgContent[imgCount][2];
        }
    }
}
