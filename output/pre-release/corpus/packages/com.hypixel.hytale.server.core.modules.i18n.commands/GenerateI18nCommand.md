# GenerateI18nCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.i18n.commands | Extends: AbstractAsyncCommand

public class GenerateI18nCommand extends AbstractAsyncCommand

## Fields

- public static final HytaleLogger LOGGER
- protected final FlagArg cleanArg

## Methods

- @Nonnull @Override protected CompletableFuture<Void> executeAsync(CommandContext context)
- @Nonnull private TranslationMap mergei18nWithOnDisk(Path path, TranslationMap generated, boolean cleanOldKeys) throws Exception
- private void writeTranslationMap(Path path, TranslationMap translationMap) throws Exception
- @Nonnull private static Set<T> difference(Set<T> a, Set<T> b)

Also in this package: EnableTmpTagsCommand, InternationalizationCommands

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)
  private TranslationMap mergei18nWithOnDisk(Path path, TranslationMap generated, boolean cleanOldKeys)
  private void writeTranslationMap(Path path, TranslationMap translationMap)
  private static Set<T> difference(Set<T> a, Set<T> b)

Fields:
public static final HytaleLogger LOGGER
protected final FlagArg cleanArg
