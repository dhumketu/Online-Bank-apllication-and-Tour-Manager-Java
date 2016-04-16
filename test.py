import urllib2
import urllib
from bs4 import BeautifulSoup as BS
import pyttsx
import lxml.html
import sys
import unicodedata  # for unicode error

def wea(cntry,city):
    try:
	    url = "http://www.timeanddate.com/weather" + "/" + cntry + "/" + city
	    we  = open('./weather.txt','w')
	    src = urllib2.urlopen(url).read()
	    bs = BS(src,"lxml")
	    list1 = [0]
	    list2 = [0]
	    list3 = [0]
	    a,b,c = 0,0,0
	    for n in bs.find_all("div", {"id": "qlook"}):
		for i in n.find_all("div"):
		    Value1 =  i.text
		    tmp = unicodedata.normalize('NFKD', Value1).encode('ascii','ignore')
		    list1.insert(a,tmp)
		    a = a+1
	    for n in bs.find_all("div", {"id": "qlook"}):
		for i in n.find_all("p"):
		    Value1 = i.text
		    tmp = unicodedata.normalize('NFKD', Value1).encode('ascii','ignore')
		    list2.insert(b,tmp)
		    b = b+1
	    for n in bs.find_all("div", {"id": "qfacts"}):
		for i in n.find_all("p"):
		    Value1 = i.text
		    tmp = unicodedata.normalize('NFKD', Value1).encode('ascii','ignore')
		    list3.insert(c,tmp)
		    c = c+1
	    engine = pyttsx.init()
	    engine.setProperty('rate',160)
	    # print list1
	    # print list2
	    # print list3
	    we.write(list3[0]+"\n")
	    we.write("Current Temperature : "+list1[1]+"\n")
	    #engine.say(list3[0])
	    print list1[1]
	    #engine.say("weather is "+list2[0])
	    #engine.say("Current Temperature : "+list1[1])
	    for i in range(1,len(list2)-1):
		we.write(list2[i]+"\n")
	       # engine.say(list2[i])
	    for i in range(1,len(list3)-1):
		we.write(list3[i]+"\n")
	    we.close()
	       # engine.say(list3[i])
	    #engine.runAndWait()
    except urllib2.HTTPError:
	    print "oops error"
	
fl = open("India",'r')
for line in fl.read().split('\n'):
	cty = line.split('\t')[0]
	if len(cty.split(' '))==2:
		lin =  cty.split(' ')[0]+line.split('\t')[0].split(' ')[1]
	else:
		lin = cty
	print lin
	wea("India",lin)
fl.close()

fl = open("Australia",'r')
for line in fl.read().split('\n'):
	cty = line.split('\t')[0]
	if len(cty.split(' '))==2:
		lin =  cty.split(' ')[0]+line.split('\t')[0].split(' ')[1]
	else:
		lin = cty
	print lin
	wea("Australia",lin)
fl.close()

fl = open("Japan",'r')
for line in fl.read().split('\n'):
	cty = line.split('\t')[0]
	if len(cty.split(' '))==2:
		lin =  cty.split(' ')[0]+line.split('\t')[0].split(' ')[1]
	else:
		lin = cty
	print lin
	wea("Japan",lin)
fl.close()

fl = open("UK",'r')
for line in fl.read().split('\n'):
	cty = line.split('\t')[0]
	if len(cty.split(' '))==2:
		lin =  cty.split(' ')[0]+line.split('\t')[0].split(' ')[1]
	else:
		lin = cty
	print lin
	wea("UK",lin)
fl.close()

fl = open("USA",'r')
for line in fl.read().split('\n'):
	cty = line.split('\t')[0]
	if len(cty.split(' '))==2:
		lin =  cty.split(' ')[0]+line.split('\t')[0].split(' ')[1]
	else:
		lin = cty
	print lin
	wea("USA",lin)
fl.close()

fl = open("Europe",'r')
for line in fl.read().split('\n'):
	cty = line.split('\t')[0]
	if len(cty.split(' '))==2:
		lin =  cty.split(' ')[0]+line.split('\t')[0].split(' ')[1]
	else:
		lin = cty
	print lin
	wea("Europe",lin)
fl.close()

