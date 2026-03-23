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
