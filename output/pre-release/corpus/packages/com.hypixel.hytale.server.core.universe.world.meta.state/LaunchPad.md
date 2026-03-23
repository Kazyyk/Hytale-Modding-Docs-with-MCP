# LaunchPad

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta.state | Extends: java.lang.Object | Implements: Component<ChunkStore>

public class LaunchPad implements Component<ChunkStore>

Block state component for launch pad blocks. Stores the launch velocity vector that is applied to entities stepping on the block. Configurable via the codec system.

Also in this package: BlockMapMarker, BlockMapMarkerData, BlockMapMarkersResource, LaunchPadSettingsPage, LaunchPadSettingsPageEventData, MarkerProvider, OnAddRemove, OnRemove, RespawnBlock

Complete API:
  public static ComponentType<ChunkStore,LaunchPad> getComponentType()
  public float getVelocityX()
  public float getVelocityY()
  public float getVelocityZ()
  public boolean isPlayersOnly()
  private static float clampVelocity(float velocity)
  public String toString()
  public Component<ChunkStore> clone()

Fields:
private static final int MAX_VELOCITY
public static final BuilderCodec<LaunchPad> CODEC
private float velocityX
private float velocityY
private float velocityZ
private boolean playersOnly
