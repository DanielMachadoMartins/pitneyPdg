package br.com.pdg.parseXml;

import java.io.File;

import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

/**
 * 
 * @author <a href="mailto:edson.pereira@pb.com">Edson Alves Pereira</a>
 *
 */
public class JaxbUtils {
	private static final Logger LOGGER = Logger.getLogger(JaxbUtils.class);


	public static <T> T unmashaller(String xmlFilePath, Class<T> object)
			 {
		JAXBContext context;
		Unmarshaller unmarshaller;
		T returnType = null;

		try {
			context = JAXBContext.newInstance(object);
			unmarshaller = context.createUnmarshaller();
			returnType = (T) unmarshaller
					.unmarshal(new File(xmlFilePath));
			
			
		} catch (JAXBException e) {
			LOGGER.error(e.getMessage(), e);

			throw new DataBindingException(e);
		}

		return returnType;
	}
}
