# PendingLoadPlugin

Type: class | Package: com.hypixel.hytale.server.core.plugin.pending

public abstract class PendingLoadPlugin

## Fields

- @Nonnull private final PluginIdentifier identifier
- @Nonnull private final PluginManifest manifest
- @Nullable private final Path path

## Constructors

- PendingLoadPlugin(@Nullable Path path, @Nonnull PluginManifest manifest)

## Methods

- @Nonnull public PluginIdentifier getIdentifier()
- @Nonnull public PluginManifest getManifest()
- @Nullable public Path getPath()
- public abstract PendingLoadPlugin createSubPendingLoadPlugin(PluginManifest var1)
- @Nonnull public abstract PluginBase load()
- @Nonnull public List<PendingLoadPlugin> createSubPendingLoadPlugins()
- public boolean dependsOn(PluginIdentifier identifier)
- public abstract boolean isInServerClassPath()
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()
- @Nonnull public static List<PendingLoadPlugin> calculateLoadOrder(@Nonnull Map<PluginIdentifier, PendingLoadPlugin> pending)

## Inner Types

- `PendingLoadPlugin.EntryNode`

Known subclasses: PendingLoadJavaPlugin

Also in this package: EntryNode, PendingLoadJavaPlugin

Complete API:
  public PluginIdentifier getIdentifier()
  public PluginManifest getManifest()
  public Path getPath()
  public abstract PendingLoadPlugin createSubPendingLoadPlugin(PluginManifest var1)
  public abstract PluginBase load()
  public List<PendingLoadPlugin> createSubPendingLoadPlugins()
  public boolean dependsOn(PluginIdentifier identifier)
  public abstract boolean isInServerClassPath()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static List<PendingLoadPlugin> calculateLoadOrder(Map<PluginIdentifier,PendingLoadPlugin> pending)

Fields:
private final PluginIdentifier identifier
private final PluginManifest manifest
private final Path path
