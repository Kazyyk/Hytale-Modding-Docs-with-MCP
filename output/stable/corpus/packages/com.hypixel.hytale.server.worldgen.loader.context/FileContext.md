# FileContext

Type: interface | Package: com.hypixel.hytale.server.worldgen.loader.context

public class FileContext<T>

## Fields

- private final int id
- private final String name
- private final Path filepath
- private final T parentContext
- private final String registryName
- private final Object2ObjectMap<String, T> backing

## Methods

- public int getId()
- public String getName()
- public Path getPath()
- public T getParentContext()
- public int size()
- public boolean contains(String name)
- @Nonnull public T get(String name)
- public void register(String name, T biome)
- public FileContext(int id, String name, Path filepath, T parentContext)

## Inner Types

- `FileContext.Constants`
- `FileContext.Registry`

Known subclasses: BiomeFileContext, FileLoadingContext, ZoneFileContext

Also in this package: BiomeFileContext, Constants, Constants, Constants, Constants, FileContextLoader, FileLoadingContext, Registry, Type, ZoneFileContext

Complete API:
  public int getId()
  public String getName()
  public Path getPath()
  public T getParentContext()

Fields:
private final int id
private final String name
private final Path filepath
private final T parentContext
