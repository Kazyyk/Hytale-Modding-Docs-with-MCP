# JavaPlugin

Type: class | Package: com.hypixel.hytale.server.core.plugin | Extends: PluginBase

public abstract class JavaPlugin extends PluginBase

Base class for Java-based server plugins loaded from JAR files. Extends `PluginBase` with file path and class loader support. Automatically registers the plugin's asset pack during setup if the manifest indicates one.

## Constructors

- JavaPlugin(@Nonnull JavaPluginInit init)

## Methods

- @Nonnull public Path getFile()
- @Nonnull public PluginClassLoader getClassLoader()
- @Nonnull @Override public final PluginType getType()
