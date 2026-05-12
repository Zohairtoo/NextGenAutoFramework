package xohairtoo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter // we might take out setter because it is highly unlikely that we use it here.
@Getter
public class ConfigProperty {
    // would change it because we will use testConfig.yml files and that requires a different impl.

    // use ObjectMapper mapper = new ObjectMapper(new YAMLFactory()) to catch testConfig.yml files.
}
