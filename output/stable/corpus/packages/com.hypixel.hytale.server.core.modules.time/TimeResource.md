# TimeResource

Type: class | Package: com.hypixel.hytale.server.core.modules.time | Extends: Resource<EntityStore>

public class TimeResource implements Resource<EntityStore>

Resource tracking the current game time instant with support for time dilation modification.

## Methods

- public static ResourceType<EntityStore, TimeResource> getResourceType()
- public float getTimeDilationModifier()
- public void setTimeDilationModifier(float timeDilationModifier)
- public Instant getNow()
- public void setNow(Instant now)
- public void add(Duration duration)
- public void add(long time, TemporalUnit unit)

Also in this package: Init, Ticking, TimeModule, TimePacketSystem, TimeSystem, WorldTimeResource, WorldTimeSystems

Complete API:
  public static ResourceType<EntityStore,TimeResource> getResourceType()
  public float getTimeDilationModifier()
  public void setTimeDilationModifier(float timeDilationModifier)
  public Instant getNow()
  public void setNow(Instant now)
  public void add(Duration duration)
  public void add(long time, TemporalUnit unit)
  public Resource<EntityStore> clone()
  public String toString()

Fields:
public static final BuilderCodec<TimeResource> CODEC
private Instant now
private float timeDilationModifier
