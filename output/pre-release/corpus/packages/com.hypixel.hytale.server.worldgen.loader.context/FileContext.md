# FileContext

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.context

public class FileContext<T extends FileContext<?>>

Generic file context node in the world generation loading hierarchy. Holds an ID, name, file path, and parent context reference. Provides methods to navigate to the root context and compute a content path relative to the root. Contains an inner `Registry` for named entries and a `RootContext` singleton.
