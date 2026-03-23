# PortalRemovalCondition

Type: class | Package: com.hypixel.hytale.builtin.portals.integrations | Implements: RemovalCondition

public class PortalRemovalCondition implements RemovalCondition

## Fields

- public static final BuilderCodec<PortalRemovalCondition> CODEC
- private final WorldEmptyCondition worldEmptyCondition
- private TimeoutCondition timeLimitCondition

## Methods

- private double getTimeLimitSeconds()
- private void setTimeLimitSeconds(double timeLimitSeconds)
- public double getElapsedSeconds(World world)
- public double getRemainingSeconds(World world)
- public static void setRemainingSeconds(World world, double seconds)
- @Override public boolean shouldRemoveWorld(Store<ChunkStore> store)

Also in this package: PortalGameplayConfig, PortalMarkerProvider

Complete API:
  private double getTimeLimitSeconds()
  private void setTimeLimitSeconds(double timeLimitSeconds)
  public double getElapsedSeconds(World world)
  public double getRemainingSeconds(World world)
  public static void setRemainingSeconds(World world, double seconds)
  public boolean shouldRemoveWorld(Store<ChunkStore> store)

Fields:
public static final BuilderCodec<PortalRemovalCondition> CODEC
private final WorldEmptyCondition worldEmptyCondition
private TimeoutCondition timeLimitCondition
