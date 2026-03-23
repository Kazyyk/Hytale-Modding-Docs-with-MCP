# PluginManifest

Type: class | Package: com.hypixel.hytale.common.plugin

public class PluginManifest

## Fields

- private static final BuilderCodec.Builder<PluginManifest> BUILDER
- public static final String CORE_GROUP
- private static final Semver CORE_VERSION
- private String group
- private String name
- private Semver version
- private String description
- private List<AuthorInfo> authors
- private String website
- private String main
- private String serverVersion
- private Map<PluginIdentifier, SemverRange> dependencies
- private Map<PluginIdentifier, SemverRange> optionalDependencies
- private Map<PluginIdentifier, SemverRange> loadBefore
- private List<PluginManifest> subPlugins
- private boolean disabledByDefault
- private boolean includesAssetPack
- private final String group
- private final String name
- private final Semver version
- private String description
- private final String main
- private final Map<PluginIdentifier, SemverRange> dependencies
- private final Map<PluginIdentifier, SemverRange> optionalDependencies
- private final Map<PluginIdentifier, SemverRange> loadBefore

## Methods

- public String getGroup()
- public String getName()
- public Semver getVersion()
- @Nullable public String getDescription()
- @Nonnull public List<AuthorInfo> getAuthors()
- @Nullable public String getWebsite()
- public void setGroup(@Nonnull String group)
- public void setName(@Nonnull String name)
- public void setVersion(@Nullable Semver version)
- public void setDescription(@Nullable String description)
- public void setAuthors(@Nonnull List<AuthorInfo> authors)
- public void setWebsite(@Nullable String website)
- @Nullable public String getMain()
- public String getServerVersion()
- public void setServerVersion(@Nullable String serverVersion)
- @Nonnull public Map<PluginIdentifier, SemverRange> getDependencies()
- public void injectDependency(PluginIdentifier identifier, SemverRange range)
- @Nonnull public Map<PluginIdentifier, SemverRange> getOptionalDependencies()
- @Nonnull public Map<PluginIdentifier, SemverRange> getLoadBefore()
- public boolean isDisabledByDefault()
- public boolean includesAssetPack()
- @Nonnull public List<PluginManifest> getSubPlugins()
- public void inherit(@Nonnull PluginManifest manifest)
- @Override @Nonnull public String toString()
- @Nonnull public static PluginManifest.CoreBuilder corePlugin(@Nonnull Class<?> pluginClass)
- @Nonnull public PluginManifest.CoreBuilder description(@Nonnull String description)
- @Nonnull public final PluginManifest.CoreBuilder depends(@Nonnull Class<?>... dependencies)
- @Nonnull public final PluginManifest.CoreBuilder optDepends(@Nonnull Class<?>... dependencies)
- @Nonnull public final PluginManifest.CoreBuilder loadsBefore(@Nonnull Class<?>... plugins)
- @Nonnull public PluginManifest build()

## Inner Types

- `PluginManifest.CoreBuilder`

Also in this package: AuthorInfo, CoreBuilder, PluginIdentifier

Complete API:
  public String getGroup()
  public String getName()
  public Semver getVersion()
  public String getDescription()
  public List<AuthorInfo> getAuthors()
  public String getWebsite()
  public void setGroup(String group)
  public void setName(String name)
  public void setVersion(Semver version)
  public void setDescription(String description)
  public void setAuthors(List<AuthorInfo> authors)
  public void setWebsite(String website)
  public String getMain()
  public String getServerVersion()
  public void setServerVersion(String serverVersion)
  public Map<PluginIdentifier,SemverRange> getDependencies()
  public void injectDependency(PluginIdentifier identifier, SemverRange range)
  public Map<PluginIdentifier,SemverRange> getOptionalDependencies()
  public Map<PluginIdentifier,SemverRange> getLoadBefore()
  public boolean isDisabledByDefault()
  public boolean includesAssetPack()
  public List<PluginManifest> getSubPlugins()
  public void inherit(PluginManifest manifest)
  public String toString()
  public static PluginManifest.CoreBuilder corePlugin(Class<?> pluginClass)

Fields:
private static final BuilderCodec.Builder<PluginManifest> BUILDER
public static final Codec<PluginManifest> CODEC
public static final Codec<PluginManifest[]> ARRAY_CODEC
public static final String CORE_GROUP
private static final Semver CORE_VERSION
private String group
private String name
private Semver version
private String description
private List<AuthorInfo> authors
private String website
private String main
private String serverVersion
private Map<PluginIdentifier,SemverRange> dependencies
private Map<PluginIdentifier,SemverRange> optionalDependencies
private Map<PluginIdentifier,SemverRange> loadBefore
private List<PluginManifest> subPlugins
private boolean disabledByDefault
private boolean includesAssetPack
