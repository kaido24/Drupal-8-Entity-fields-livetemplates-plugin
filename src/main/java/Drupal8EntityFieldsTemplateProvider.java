import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Kaido Toomingas 27/08/2019.
 */
public class Drupal8EntityFieldsTemplateProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{"liveTemplates/DrupalEntityFields"};
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}
