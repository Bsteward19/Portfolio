//load modules
var Knwl = require('knwl');
var request = require('request');
var cheerios = require('cheerio');
//create global variable to hold HTML information
global.globalLog = "This is a variable";
var email = 'Tim@canddi.com';
var domain = email.replace(/.*@/,"https://www.");
console.log(domain);
//print base variable contents to ensure its initialised
console.log(globalLog);
var knwlInstance = new Knwl('english');
//load knwl modules such as dates ect.
knwlInstance.register('dates', require('./default_plugins/dates'));
//get website, and return error if it cant be found. Put website here
request(domain, function (error, response, html) {
  if (!error && response.statusCode == 200) {
   //log would usually show HTML code, left blank for clarity
    console.log(' ');
  //put html into globalLog variable
    globalLog = html;
  //initialise globalLog into knwl to extract relevant information
   knwlInstance.init(globalLog);
  //get important information as specified in brief
	var dates = knwlInstance.get('dates');
	var phone = knwlInstance.get('phones');
	var links = knwlInstance.get('links');
	var emails = knwlInstance.get('emails');
	var places = knwlInstance.get('places');
	knwlInstance.get('dates');
	knwlInstance.get('phones');
	knwlInstance.get('links');
	knwlInstance.get('emails');
	knwlInstance.get('places');
	console.log(dates);
	console.log(phone);
	console.log(links);
	console.log(emails);
	console.log(places);
  }
});


