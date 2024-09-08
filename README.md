# soap-to-rest
<h3> Call SOAP api from REST api in spring boot  </h3>

    Firstly I generate java POJO calsses from wsdl file by using cxf-codegen-plugin.

    And then I make custom web service class by entending WebServiceGatewaySupport and add Jaxb2Marshaller 
    for marshal and unmarshal my pojo class 

