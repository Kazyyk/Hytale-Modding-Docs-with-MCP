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
