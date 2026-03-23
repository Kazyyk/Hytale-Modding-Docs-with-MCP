# FileContext

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.context

public class FileContext<T extends FileContext<?>>

Generic file context node in the world generation loading hierarchy. Holds an ID, name, file path, and parent context reference. Provides methods to navigate to the root context and compute a content path relative to the root. Contains an inner `Registry` for named entries and a `RootContext` singleton.

Known subclasses: BiomeFileContext, CaveFileContext, FileLoadingContext, RootContext, ZoneFileContext

Also in this package: BiomeFileContext, CaveFileContext, Constants, Constants, Constants, Constants, FileContextLoader, FileLoadingContext, Registry, RootContext, Type, ZoneFileContext

Complete API:
  public int getId()
  public String getName()
  public Path getPath()
  public String getRootPath()
  public T getParentContext()
  public String getContentPath()
  public FileContext<?> getRoot()
  private static String toContentPath(Path filepath, FileContext<?> parent)

Fields:
private final int id
private final String name
private final Path filepath
private final T parentContext
private transient String rootPath
private transient String contentPath
