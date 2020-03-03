package com.example.geeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String[] smsArray01 = {"आत्‍मा को ना तो किसी शस्‍त्र से काटा जा सकता है और ना ही जलाया जा सकता है, ना ही पानी से गिला किया जा सकता है और ना ही हवा से सुखाया जा सकता है क्‍योंकि आत्‍मा तो अमर है। ","जब-जब इस धरती पर पाप, अहंकार और अधर्म बढ़ेगा तो उसका विनाश कर पुन: धर्म की स्‍थापना करने हेतु मैं अवश्‍य अवतार लेता रहूँगा। ","मन  अशांत है और उसे नियंत्रित करना कठिन है, लेकिन अभ्यास से इसे वश में किया जा सकता है। "," लोग आपके अपमान के बारे में हमेंशा बात करेंगे। सम्मानित व्यक्ति के लिए, अपमान मृत्यु से भी बदतर है। "," इंद्रियों से खुशी पहली बार में अमृत की तरह लगती है, लेकिन यह अंत में जहर की तरह कड़वी होती है। "," मन बड़ा चंचल है, मनुष्य को मथ डालता है, अतः बहुत बलवान है। "," ऐसा कुछ भी नहीं चेतन या अचेतन, जो मेरे बिना अस्तित्व में रह सकता हो। "," स्वर्ग प्राप्त करने और वहां कई वर्षों तक वास करने के पश्चात एक असफल योगी का पुन: एक पवित्र और समृद्ध कुटुंब में जन्म होता है। "," सदैव संदेह करने वाले व्यक्ति के लिए प्रसन्नता ना इस लोक में  है और ना ही कहीं और। "," अगर आप अपने लक्ष्‍य को प्राप्‍त करने में असफल हो जाते हैं तो अपनी रणनीति बदलिए, न कि लक्ष्‍य। "," वह जो मृत्यु के समय मुझे स्मरण करते हुए अपना शरीर त्यागता है, वह मेरे धाम को प्राप्त होता है। इसमें कोई शंशय नहीं है। "," मैं ही सृष्टि की शुरुआत, मध्य और अंत हूँ। "," क्रोध से  भ्रम  पैदा होता है। भ्रम से बुद्धि व्यग्र होती है। जब बुद्धि व्यग्र होती है तब तर्क नष्ट हो जाता है और जब तर्क नष्ट होता है तब व्यक्ति का पतन हो जाता है। "," जो व्‍यवहार आपको दूसरो से पसंद ना हो, ऐसा व्‍यवहार आप दूसरो के साथ भी ना करे। "," क्षमा, दया और करूणा मनुष्‍य के अनमोल गुण है। "," भगवान सभी जगह में हैं सभी के उपर हैं | "," ज्ञानी व्यक्ति, ज्ञान और कर्म को एक रूप में देखता है, वही सही मायने में  देखता है। "," अव्यवहारिक कार्य बहुत ज्यादा तनाव उत्पन्न करता हैं | "," आसक्ति से कामना का जन्म होता हैं। "," जो मन को नियंत्रित नहीं करते, उनके लिए वह शत्रु के समान कार्य करता है। "," कार्य में कुशलता को योग कहते है। "," सर्वत्र समभाव रखने वाला योगी अपने को सब भूतों में, और सब भूतों को अपने में देखता है। "," आत्म-ज्ञान की तलवार से काटकर अपने ह्रदय से अज्ञान के संदेह को  अलग कर दो। अनुशाषित रहो। उठो। "," ईश्वर सब प्राणियों के ह्रदय में वास करता है, और अपनी माया के बल से उन्हें चाक पर चढ़े हुये घड़े की भांति घुमाता है। "," मनुष्य अपने विश्वास से निर्मित होता है। वो जैसा विश्वास करता है वैसा ही वो बन जाता है। "," मन की गतिविधियों, होश, श्‍वास और भावनाओं के माध्‍यम से भगवान की शक्ति सदा तुम्‍हारे साथ है और लगातार तुम्‍हे बस एक साधन की तरह प्रयोग करके सभी कार्य कर रही है। "," जो मन को नियंत्रित नहीं करते उनके लिए वह शत्रु के समान कार्य करता है। "," अपने अनिवार्य कार्य करो, क्योंकि वास्तव में कार्य करना निष्क्रियता से बेहतर है। "," जो अपने हिस्से का काम किये बिना ही भोजन पाते है, वे चोर है। "," इस जीवन में ना कुछ खोता है और ना कुछ व्यर्थ होता है। "," मैंने तुम्‍हारे लिए वही विधान किया जो तुम्‍हारे लिए उचित था। मैंने आज तक जो कुछ कि‍या तुम्‍हारे मंगल के लिए किया। "," निर्माण केवल पहले से मौजूद चीजों का प्रक्षेपण है। "," नर्क के तीन द्वार हैं: वासना, क्रोध और लालच। "," परमात्मा को प्राप्ति के इच्छुक ही ब्रम्हचर्य का पालन करते है। "," व्यक्ति जो चाहे बन सकता है यदि वह विश्वास के साथ इच्छित वस्तु  पर लगातार चिंतन करे। "," उससे मत डरो जो वास्तविक नहीं है, ना कभी था ना कभी होगा। जो वास्तविक है, वो हमेंशा था और उसे कभी नष्ट नहीं किया जा सकता। "," ज्ञानी व्यक्ति को  कर्म के प्रतिफल की अपेक्षा कर रहे  अज्ञानी व्यक्ति के दिमाग को अस्थिर नहीं करना चाहिए। "," हर व्यक्ति का विश्वास उसकी प्रकृति के अनुसार होता है। "," जन्म लेने वाले के लिए मृत्यु उतनी ही निश्चित है जितना कि मृत होने वाले के लिए जन्म लेना। इसलिए जो अपरिहार्य है उस पर शोक मत करो। "," अप्राकृतिक कर्म बहुत तनाव पैदा करता है। "," सभी अच्छे काम छोड़ कर बस भगवान में पूर्ण रूप से समर्पित हो जाओ। मैं तुम्हे सभी पापों से मुक्त कर दूंगा। शोक मत करो। "," किसी और का काम पूर्णता से करने से कही अच्छा है कि अपना काम करें, भले ही उसे अपूर्णता से करना पड़े। "," मैं उन्हें ज्ञान देता हूँ जो सदा मुझसे जुड़े रहते हैं और मुझसे प्रेम करते हैं। "," मैं सभी प्राणियों को सामान रूप से देखता हूँ, ना कोई मुझे कम प्रिय है ना अधिक, लेकिन जो मेरी प्रेमपूर्वक आराधना करते हैं वो मेरे भीतर रहते हैं और मैं उनके जीवन में आता हूँ। "," प्रबुद्ध व्यक्ति सिवाय ईश्वर के किसी और पर निर्भर नहीं करता। "," मेरी कृपा से कोई  सभी कर्तव्यों का निर्वाह करते हुए भी बस मेरी शरण में आकर  अनंत अविनाशी निवास को प्राप्त करता है। "," हे अर्जुन, केवल भाग्यशाली योद्धा ही ऐसा युद्ध लड़ने का अवसर पाते हैं जो स्वर्ग के द्वार के सामान है। "," पराक्रमी वह है जो निर्भय और पवित्र है और जो अपने संकल्‍प से डिगता नहीं है। "," बुद्धिमान व्यक्ति कामुक सुख में आनंद नहीं लेता। "," आपके सार्वलौकिक रूप का मुझे न प्रारंभ, न मध्य, न अंत दिखाई दे रहा है। "," मैं धरती की मधुर सुगंध हूँ।  मैं अग्नि की ऊष्मा हूँ, सभी जीवित प्राणियों का जीवन और सन्यासियों का आत्मसंयम हूँ। "," तुम उसके लिए शोक करते हो जो शोक करने के योग्य नहीं हैं, और फिर भी ज्ञान की बाते करते हो। बुद्धिमान व्यक्ति ना तो जीवित व्‍यक्ति के लिए शोक करते हैं और ना ही मृत व्यक्ति के लिए। "," कर्म मुझे बांधता नहीं, क्योंकि मुझे कर्म के प्रतिफल की कोई इच्छा नहीं। "," हे अर्जुन! हम दोनों ने कई जन्म लिए हैं। मुझे याद हैं, लेकिन तुम्हे नहीं। "," अपने परम भक्तों, जो हमेशा मेरा स्मरण या एक-चित्त मन से मेरा पूजन करते हैं, मैं व्यक्तिगत रूप से  उनके कल्याण का उत्तरदायित्व  लेता हूँ। "," कर्म योग वास्तव में एक परम रहस्य है। "," कर्म उसे नहीं बांधता जिसने काम का त्याग कर दिया है। "," बुद्धिमान व्यक्ति को समाज कल्याण के लिए बिना आसक्ति के काम करना चाहिए। "," जो  व्यक्ति  आध्यात्मिक  जागरूकता  के  शिखर  तक  पहुँच  चुके  हैं, उनका  मार्ग है  निःस्वार्थ  कर्म।  जो  भगवान्  के  साथ  संयोजित हो  चुके  हैं उनका  मार्ग  है, स्थिरता  और  शांति। "," यद्यपी  मैं  इस  तंत्र  का  रचयिता  हूँ, लेकिन  सभी  को  यह  ज्ञात  होना चाहिए कि  मैं  कुछ  नहीं  करता  और  मैं  अनंत  हूँ। "," जब  वे  अपने  कार्य  में  आनंद  खोज  लेते  हैं तब वे पूर्णता  प्राप्त   करते  हैं। "," वह  जो  सभी  इच्छाएं  त्याग  देता  है  और  “मैं”  और  “मेरा” की  लालसा और भावना  से  मुक्त  हो  जाता  है  उसे  शांति  प्राप्त  होती  है। "," मेरे  लिए  ना  कोई  घृणित   है  ना  प्रिय, किन्तु  जो  व्यक्ति  भक्ति  के साथ मेरी  पूजा  करते  हैं, वो  मेरे  साथ  हैं  और  मैं  भी  उनके  साथ हूँ। "," जो  इस  लोक  में  अपने  काम  की  सफलता  की  कामना  रखते  हैं वे देवताओं का  पूजन   करें। "," मैं  ऊष्मा  देता  हूँ, मैं  वर्षा करता हूँ  और  रोकता  भी हूँ, मैं  अमरत्व   भी  हूँ और  मृत्यु  भी। "," बुरे  कर्म  करने  वाले, सबसे  नीच व्यक्ति जो  राक्षसी  प्रवित्तियों  से  जुड़े  हुए हैं, और  जिनकी  बुद्धि  माया  ने  हर  ली  है  वो  मेरी  पूजा  या  मुझे  पाने का प्रयास  नहीं  करते। "," जो  कोई  भी,  जिस  किसी  भी  देवता  की  पूजा  विश्वास  के  साथ  करने की इच्छा  रखता  है, मैं  उसका  विश्वास  उसी  देवता  में  दृढ  कर  देता हूँ। "," जैसे आग की गर्मी लकड़ी को राख बना देती है उसी प्रकार ज्ञान की अग्नि कर्म को राख बना देती है। "," हे  अर्जुन ! मैं  भूत, वर्तमान  और  भविष्य  के  सभी  प्राणियों  को  जानता हूँ, किन्तु  वास्तविकता  में  कोई  मुझे  नहीं  जानता। "," स्वर्ग  प्राप्त  करने  और  वहां  कई  वर्षों  तक  वास  करने  के  पश्चात  एक असफल  योगी  का  पुन:   एक  पवित्र  और  समृद्ध  कुटुंब  में  जन्म  होता  है। "," केवल मन  ही  किसी  का  मित्र  और  शत्रु  होता  है। "," मैं  सभी  प्राणियों  के  ह्रदय  में  विद्यमान  हूँ। "," वह  जो ज्ञान  में  विश्वास  नहीं  रखते, मुझे  प्राप्त  किये  बिना   जन्म और मृत्यु  के  चक्र  का अनुगमन  करते  हैं। "," मेरा-तेरा, छोटा-बड़ा, अपना-पराया, मन से मिटा दो फिर सब तुम्‍हारा है और तुम सबके हो। "," जिस मनुष्‍य के पास सत्‍वगुणी संपति है, उसे मैं मोक्ष और सुख अवश्‍य प्रदान करता हूँ। "," एक पत्‍थर सिर्फ एक बार मन्दिर जाता है और भगवान बन जाता है लेकिन हम इंसान हर रोज मन्दिर जाते हैं पर भगवान तो दूर इंसान भी नहीं बन पाते हैं। "," जीवन ना तो भविष्‍य में है और ना ही अतित में है। जीवन तो केवल इस पल में है अर्थात् इस पल का अनुभव ही जीवन है। "," इस जगत में आपका ‘’इंसान’’ के रूप में होना ही आपके लिए सबसे खुशी की बात है। "," मैं सारे जीव और निर्जिव में निवास करता हूँ। जो सर्वत्र मुझे देखता और महसूस करता है वो मुझे समझ सकता है और मुझ तक आ सकता है। "," परिवर्तन ही संसार का नियम है जिसे तुम मृत्‍यु समझते हो, वही तो जीवन है। एक क्षण में तुम करोड़ों के स्‍वामी बन जाते हो और दूसरे ही क्षण तुम दरिद्र हो जाते हो। "," ज्ञान का अर्थ है जानने की शक्ति। झूठ को सच से प्रथक करने वाली जो विवेक बुद्धि है उसी का नाम ज्ञान है। "," जो हुआ, वह अच्‍छा हुआ। जो हो रहा है, वह अच्‍छा हो रहा है। जो होगा, वह अच्‍छा ही होगा। तुम भूत का पश्‍चाताप न करो। भविष्‍य की चिन्‍ता न करो। वर्तमान चल रहा है। "," खाली हाथ आए और खाली हाथ चले जाना है। जो आज तुम्‍हारा है, कल किसी और का था, परसों किसी और का होगा। तुम इसे अपना समझ कर मग्‍न हो रहे हो। बस यही प्रसन्‍नता तुम्‍हारे दु:खों का कारण है। "," ना यह शरीर तुम्‍हारा है और न ही तुम शरीर के हो। यह अग्नि, जल, वायु, पृथ्‍वी, आकाश से बना है और इसी में मिल जायेगा परंतु आत्‍मा स्थिर है- फिर तुम क्‍या हो? "," वह जो वास्तविकता में मेरे उत्कृष्ट जन्म और गतिविधियों को समझता है, वह शरीर त्यागने के बाद पुनः जन्म नहीं लेता और मेरे धाम को प्राप्त होता है। "," तुम अपने आपको भगवान को अर्पित करो। यही सबसे उत्‍तम सहारा है। जो इसके सहारे को जानता है वह भय, चिन्‍ता, शोक से सर्वदा मुक्‍त है। "," फल की अभिलाषा छोड़ कर कर्म करने वाला पुरूष ही अपने जीवन को सफल बनाता है। "," अपने परम भक्‍तों, जो हमेंशा मेरा स्‍मरण या एक-चित्‍त मन से मेरा पूजन करते हैं, मैं व्‍यक्तिगत रूप से उनके कल्‍याण का उत्‍तरदायित्‍व लेता हूँ। "," कभी ऐसा समय नहीं था जब मैं, तुम या ये राजा-महाराजा अस्तित्‍व में नहीं थे, न ही भविष्‍य में कभी ऐसा होगा कि हमारा अस्तित्‍व समाप्‍त हो जाये। "," मैं धरती की मधुर सुगंध हूँ। मैं अग्नि की ऊष्मा हूँ, सभी जीवित प्राणियों का जीवन और सन्यासियों का आत्मसंयम हूँ। "," जो कार्य में निष्क्रियता और निष्क्रियता में कार्य देखता है वह एक बुद्धिमान व्यक्ति है। "," जन्म के समय में आप क्या लाए थे जो अब खो दिया है? आप ने क्या पैदा किया था जो नष्ट हो गया है?  जब आप पैदा हुए थे, तब आप कुछ भी साथ नहीं लाए थे।  आपके पास जो कुछ भी है,  आप को इस धरती पर भगवान से ही प्राप्त हुआ है। आप इस धरती पर जो भी दोगे, तुम भगवान को ही दोगे।  हर कोई खाली हाथ इस दुनिया में आया था और खाली हाथ ही उसी रास्ते पर चलना होगा। सब कुछ केवल भगवान के अंतर्गत आता है। "," आत्मा अजन्म है और कभी नहीं मरती है। आत्मा मरने के बाद भी हमेंशा के लिए रहती है।  तो क्यों व्यर्थ की चिंता करते हो? आप किस बात से डर रहे हैं?  कौन तुम्हें मार सकता है?" ," शांति से भी दुखों का अंत हो जाता है और शांत चित्त मनुष्य की बुद्धि शीघ्र ही स्थिर होकर परमात्मा से युक्त हो जाती है। "," क्यों व्यर्थ की चिंता करते हो? किससे व्यर्थ में डरते हो? कौन तुम्हें मार सकता है? आत्मा ना पैदा होती है, न मरती है । "," हर काम का फल मिलता है-' इस जीवन में ना कुछ खोता है ना व्यर्थ होता है।' ","विषयों का चिंतन करने से विषयों की आसक्ति होती है। आसक्ति से इच्छा उत्पन्न होती है  और इच्छा से क्रोध होता है।क्रोध से सम्मोहन और अविवेक उत्पन्न होता है। ","संयम का प्रयत्न करते हुए ज्ञानी मनुष्य के मन को भी चंचल इंद्रियां बलपूर्वक हर लेती हैं। जिसकी इंद्रियां वश में होती है, उसकी बुद्धि स्थिर होती है। ","जो भी मनुष्य अपने जीवन , आध्यात्मिक ज्ञान के चरणों के लिए दृढ़ संकल्प में स्थिर है; वह सामान्य रूप से संकटों के आक्रमण को सहन कर सकते हैं और निश्चित रुप से खुशियां और मुक्ति पाने के पात्र हैं। ","जब तुम्हारी बुद्धि मोह रूपी दलदल को पार कर जाएगी; उस समय तुम शास्त्र से सुने गए  और सुनने योग्य वस्तुओं से भी वैराग्य प्राप्त करोगे। ","केवल कर्म करना ही मनुष्य के वश में है, कर्मफल नहीं। इसलिए तुम कर्मफल की आसक्ति में ना फसो तथा कर्म का त्याग भी ना करो। "," तुम्हारा क्या गया, जो तुम रोते हो? तुम क्या लाए थे, जो तुमने खो दिया? तुमने क्या पैदा किया था, जो नाश हो गया? न तुम कुछ लेकर आए, जो लिया; यही से लिया; जो दिया, यही पर दिया, जो लिया,इसी(ईश्वर) से लिया; जो दिया,इसी को दिया। "," जो मन को नियंत्रित नहीं करते उनके लिए यह शत्रु के समान कार्य करता है। "," खाली हाथ आए और खाली हाथ वापस चले। जो आज तुम्हारा है, कल और किसी का या परसों किसी और का होगा, तुम इसे अपना समझ कर मग्न हो रहे हो। "," सुख - दुख, लाभ - हानि और  जीत - हार की चिंता ना करके, मनुष्य को अपनी शक्ति के अनुसार कर्तव्य कर्म करना चाहिए। ऐसे भाव से कर्म करने पर मनुष्य को पाप नहीं लगता। "," जो हुआ, वह अच्छा हुआ। जो हो रहा है, वह अच्छा हो रहा है । जो होगा, वह भी अच्छा ही होगा। तुम भूत का पश्चाताप न करो। भविष्य की चिंता न करो। वर्तमान चल रहा है। "," क्रोध से भ्रम पैदा होता है, भ्रम से बुद्धि व्यग्र होती है। जब बुद्धि व्यग्र होती है तब तर्क नष्ट हो जाता है। जब तर्क नष्ट होता है तब व्यक्ति का पतन हो जाता है। "," सम्मानित व्यक्ति के लिए अपमान मृत्यु से भी बढ़कर है। "," सभी प्राणी जन्म से पहले अप्रकट थे और मृत्यु के बाद फिर अप्रकट हो जाएंगे। लेकिन जन्म और मृत्यु के बीच प्रकट दिखते हैं; फिर इसमें सोचने की क्या बात है? "," परिवर्तन संसार का नियम है। जिसे तुम मृत्यु समझते हो वही तो जीवन है। एक क्षण में तुम करोड़ों के स्वामी बन जाते हो, दूसरे चरण में तुम दरिद्र हो जाते हो। "," शस्त्र आत्मा को काट नहीं सकते, अग्नि इसको जला नहीं सकती, जल इसको गीला नहीं कर सकता, और वायु इसे सूखा नहीं सकती। "," जैसे मनुष्य अपने पुराने वस्त्रों को उतार कर दूसरे नए वस्त्र धारण करता है, वैसे ही आत्मा मृत्यु के बाद अपने पुराने शरीर को त्याग करने से ही प्राप्त करती है। "," आत्मा ना कभी जन्म लेती है और ना मरती है। शरीर का नाश होने पर भी नष्ट नहीं होता। "," आत्मा अमर है। जो लोग इस आत्मा को मारने वाला या मरने वाला मानते हैं, वे दोनों ही नासमझ है आत्मा ना किसी को मारती है और ना ही किसी के द्वारा मारी जा सकती है। "," न यह शरीर तुम्हारा है, न तुम शरीर के हो। यह अग्नि, जल, वायु ,पृथ्वी, आकाश से मिलकर बना है और इसी में मिल जाएगा। परंतु आत्मा स्थिर है- फिर तुम क्या हो? "," तुम ज्ञानियों की तरह बातें करते हो, लेकिन जिनके लिए शोक नहीं करना चाहिए उनके लिए शोक करते हो । मृत या जीवित ज्ञानी किसी के लिए शोक नहीं करते। ","कर्म ही पूजा है। "," व्यक्ति जो चाहे बन सकता है, यदि  विश्वास के साथ इच्छित वस्तु पर लगातार चिंतन करें। "," मैं काल हूँ, सबका नाशक, मैं आया हूं दुनिया का उपभोग करने के लिए। "," कर्म उसे नहीं बांधता जिसने काम का त्याग कर दिया है। "," बुद्धिमान व्यक्ति कामुख सूख में आनंद नहीं लेता।"  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
                this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
                this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                setContentView(R.layout.activity_main);


                Button btn=(Button)findViewById(R.id.button);
                btn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,MsgActivity.class);
        intent.putExtra("keyArray", smsArray01);
        startActivity(intent);
        }
        });


        }


        }