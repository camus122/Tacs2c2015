

window.google = window.google || {};
google.maps = google.maps || {};
(function() {
  
  function getScript(src) {
    document.write('<' + 'script src="' + src + '"><' + '/script>');
  }
  
  var modules = google.maps.modules = {};
  google.maps.__gjsload__ = function(name, text) {
    modules[name] = text;
  };
  
  google.maps.Load = function(apiLoad) {
    delete google.maps.Load;
    apiLoad([0.009999999776482582,[[["http://mt0.google.cn/vt?lyrs=m@160000000\u0026hl=en-US\u0026gl=CN\u0026","http://mt1.google.cn/vt?lyrs=m@160000000\u0026hl=en-US\u0026gl=CN\u0026"],null,null,null,null,"m@323000000",["https://mts0.google.com/vt?lyrs=m@323000000\u0026src=api\u0026hl=en-US\u0026gl=CN\u0026","https://mts1.google.com/vt?lyrs=m@323000000\u0026src=api\u0026hl=en-US\u0026gl=CN\u0026"]],[["http://mt0.google.cn/vt?lyrs=s@184\u0026hl=en-US\u0026gl=CN\u0026","http://mt1.google.cn/vt?lyrs=s@184\u0026hl=en-US\u0026gl=CN\u0026"],null,null,null,1,"184",["https://khms0.google.com/kh?v=184\u0026hl=en-US\u0026gl=CN\u0026","https://khms1.google.com/kh?v=184\u0026hl=en-US\u0026gl=CN\u0026"]],null,[["http://mt0.google.cn/vt?lyrs=t@127,r@160000000\u0026hl=en-US\u0026gl=CN\u0026","http://mt1.google.cn/vt?lyrs=t@127,r@160000000\u0026hl=en-US\u0026gl=CN\u0026"],null,null,null,null,"t@132,r@323000000",["https://mts0.google.com/vt?lyrs=t@132,r@323000000\u0026src=api\u0026hl=en-US\u0026gl=CN\u0026","https://mts1.google.com/vt?lyrs=t@132,r@323000000\u0026src=api\u0026hl=en-US\u0026gl=CN\u0026"]],null,null,[["http://www.google.cn/cbk?","http://www.google.cn/cbk?"]],[["http://khm0.googleapis.com/kh?v=88\u0026hl=en-US\u0026gl=CN\u0026","http://khm1.googleapis.com/kh?v=88\u0026hl=en-US\u0026gl=CN\u0026"],null,null,null,null,"88",["https://khms0.google.com/kh?v=88\u0026hl=en-US\u0026gl=CN\u0026","https://khms1.google.com/kh?v=88\u0026hl=en-US\u0026gl=CN\u0026"]],[["http://mt0.googleapis.com/mapslt?hl=en-US\u0026gl=CN\u0026","http://mt1.googleapis.com/mapslt?hl=en-US\u0026gl=CN\u0026"]],[["http://mt0.googleapis.com/mapslt/ft?hl=en-US\u0026gl=CN\u0026","http://mt1.googleapis.com/mapslt/ft?hl=en-US\u0026gl=CN\u0026"]],[["http://mt0.googleapis.com/vt?hl=en-US\u0026gl=CN\u0026","http://mt1.googleapis.com/vt?hl=en-US\u0026gl=CN\u0026"]],[["http://mt0.googleapis.com/mapslt/loom?hl=en-US\u0026gl=CN\u0026","http://mt1.googleapis.com/mapslt/loom?hl=en-US\u0026gl=CN\u0026"]],[["https://mts0.googleapis.com/mapslt?hl=en-US\u0026gl=CN\u0026","https://mts1.googleapis.com/mapslt?hl=en-US\u0026gl=CN\u0026"]],[["https://mts0.googleapis.com/mapslt/ft?hl=en-US\u0026gl=CN\u0026","https://mts1.googleapis.com/mapslt/ft?hl=en-US\u0026gl=CN\u0026"]],[["https://mts0.googleapis.com/mapslt/loom?hl=en-US\u0026gl=CN\u0026","https://mts1.googleapis.com/mapslt/loom?hl=en-US\u0026gl=CN\u0026"]]],["en-US","CN",null,0,null,null,"http://maps.gstatic.cn/mapfiles/","http://csi.gstatic.com","https://maps.googleapis.com","http://maps.google.cn",null,"https://maps.google.com","https://gg.google.com","http://maps.gstatic.cn/maps-api-v3/api/images/","http://www.google.cn/maps",1,"http://www.google.cn"],["http://maps.google.cn/maps-api-v3/api/js/22/6","3.22.6"],[3119961991],1,null,null,null,null,null,"",null,null,0,"http://khm.google.cn/mz?v=184\u0026",null,"https://earthbuilder.googleapis.com","https://earthbuilder.googleapis.com",null,"http://mt.googleapis.com/vt/icon",[["http://mt0.google.cn/vt","http://mt1.google.cn/vt"],["https://mts0.google.cn/vt","https://mts1.google.cn/vt"],null,null,null,null,null,null,null,null,null,null,["https://mts0.google.com/vt","https://mts1.google.com/vt"],"/maps/vt",323000000,132],2,500,[null,"http://g0.gstatic.com/landmark/tour","http://g0.gstatic.com/landmark/config",null,"http://www.google.com/maps/preview/log204","","http://static.panoramio.com.storage.googleapis.com/photos/",["http://www.google.cn/cbk"],"http://www.google.cn/maps/api/js/GeoPhotoService.GetMetadata","http://www.google.cn/maps/api/js/GeoPhotoService.SingleImageSearch"],["https://www.google.com/maps/api/js/master?pb=!1m2!1u22!2s6!2sen-US!3sCN!4s22/6","https://www.google.com/maps/api/js/widget?pb=!1m2!1u22!2s6!2sen-US"],null,0,null,"/maps/api/js/ApplicationService.GetEntityDetails",0,null,null,[null,null,null,null,null,null,null,null,null,[0,0],[0,null,1,"0","0","U","0","0","0","0","0","0"]]], loadScriptTime);
  };
  var loadScriptTime = (new Date).getTime();
  getScript("http://maps.google.cn/maps-api-v3/api/js/22/6/main.js");
})();
