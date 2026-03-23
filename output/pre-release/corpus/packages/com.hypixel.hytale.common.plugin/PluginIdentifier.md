# PluginIdentifier

Type: class | Package: com.hypixel.hytale.common.plugin

public class PluginIdentifier

## Fields

- public static final String THIRD_PARTY_LOADER_NAME
- private final String group
- private final String name

## Methods

- @Nullable public static PluginIdentifier identifyThirdPartyPlugin(Throwable t)
- @Nonnull public String getGroup()
- @Nonnull public String getName()
- @Override public int hashCode()
- @Override public boolean equals(@Nullable Object o)
- @Override @Nonnull public String toString()
- @Nonnull public static PluginIdentifier fromString(@Nonnull String str)

Also in this package: AuthorInfo, CoreBuilder, PluginManifest

Complete API:
  public static PluginIdentifier identifyThirdPartyPlugin(Throwable t)
  public String getGroup()
  public String getName()
  public int hashCode()
  public boolean equals(Object o)
  public String toString()
  public static PluginIdentifier fromString(String str)

Fields:
public static final String THIRD_PARTY_LOADER_NAME
private final String group
private final String name
