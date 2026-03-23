# LoadedNPCEvent

Type: class | Package: com.hypixel.hytale.server.spawning | Implements: I, E, v, e, n, t, <, V, o, i, d, >

public class LoadedNPCEvent implements IEvent<Void>

Event fired when an NPC builder info is loaded and confirmed to be spawnable. Validates that the associated builder implements ISpawnableWithModel. Carries the `BuilderInfo` instance for downstream listeners to process.
