# ChunkUnloadingSystem.Data

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: Resource<ChunkStore>

public class Data implements Resource<ChunkStore>

Resource tracking unload interval timer (0.5s), poll count, and active chunk trackers list.

Also in this package: ChunkSavingSystems, ChunkUnloadingSystem, Data, Ticking, WorldRemoved

Complete API:
  public Resource<ChunkStore> clone()
  public boolean tick(float dt)

Fields:
public static final float UNLOAD_INTERVAL
private float time
private int pollCount
private final List<ChunkTracker> chunkTrackers
