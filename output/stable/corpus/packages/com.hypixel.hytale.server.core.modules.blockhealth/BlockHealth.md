# BlockHealth

Type: class | Package: com.hypixel.hytale.server.core.modules.blockhealth | Implements: Cloneable

public class BlockHealth implements Cloneable

Tracks the health state of a single block. Health is a float normalized around `1.0` (full health). A block is considered destroyed when health reaches zero or below (checked via `MathUtil.closeToZero`). Also records the game time of the last damage event for regeneration delay calculation.

The `NO_DAMAGE_INSTANCE` sentinel is immutable and represents a block at full health.

## Fields

- public static final BlockHealth NO_DAMAGE_INSTANCE
- private float health
- private Instant lastDamageGameTime

## Methods

- public float getHealth()
- public void setHealth(float health)
- public Instant getLastDamageGameTime()
- public void setLastDamageGameTime(Instant lastDamageGameTime)
- public boolean isDestroyed()
- public boolean isFullHealth()
- public void deserialize(@Nonnull ByteBuf buf, byte version)
- public void serialize(@Nonnull ByteBuf buf)
- @Nonnull protected BlockHealth clone()

Also in this package: BlockHealthChunk, BlockHealthModule, BlockHealthPacketSystem, BlockHealthSystem, EnsureBlockHealthSystem, FragileBlock, PlaceBlockEventSystem

Complete API:
  public float getHealth()
  public void setHealth(float health)
  public Instant getLastDamageGameTime()
  public void setLastDamageGameTime(Instant lastDamageGameTime)
  public boolean isDestroyed()
  public boolean isFullHealth()
  public void deserialize(ByteBuf buf, byte version)
  public void serialize(ByteBuf buf)
  protected BlockHealth clone()
  public String toString()

Fields:
public static final BlockHealth NO_DAMAGE_INSTANCE
private float health
private Instant lastDamageGameTime
