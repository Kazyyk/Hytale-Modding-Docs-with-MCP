# BlockingDiskFile

Type: class | Package: com.hypixel.hytale.server.core.util.io

public abstract class BlockingDiskFile

Class in the io subsystem.

## Fields

- path | Path | final Path field.

## Constructors

- BlockingDiskFile(Path path) | Creates a new BlockingDiskFile instance.

## Methods

- read(BufferedReader var1) | void | protected method.
- write(BufferedWriter var1) | void | protected method.
- create(BufferedWriter var1) | void | protected method.
- syncLoad() | void | public method.
- syncSave() | void | public method.
- toLocalFile() | File | protected method.

Known subclasses: HytaleBanProvider, HytalePermissionsProvider, HytaleWhitelistProvider

Also in this package: ByteBufUtil, FileUtil

Complete API:
  protected abstract void read(BufferedReader var1)
  protected abstract void write(BufferedWriter var1)
  protected abstract void create(BufferedWriter var1)
  public void syncLoad()
  public void syncSave()
  protected File toLocalFile()

Fields:
protected final ReadWriteLock fileLock
protected final Path path
