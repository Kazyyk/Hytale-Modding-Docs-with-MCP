# EventHandler

Type: class | Package: com.hypixel.hytale.builtin.worldgen.modifier | Extends: java.lang.Object | Implements: AutoCloseable

public final class EventHandler implements AutoCloseable

Manages world-gen modification events. Collects WorldGenModifiers matching a given root, sorts by priority, and dispatches modify events to matching operations.
