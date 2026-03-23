# ReputationDataResource

Type: class | Package: com.hypixel.hytale.builtin.adventure.reputation.store | Implements: Resource

public class ReputationDataResource implements Resource<EntityStore>

ECS resource attached to `EntityStore`.

## Accessors

- getReputationStats() | Object2IntMap<String> | Accessor method.

Complete API:
  public Object2IntMap<String> getReputationStats()
  public Resource<EntityStore> clone()

Fields:
public static final BuilderCodec<ReputationDataResource> CODEC
private Object2IntMap<String> reputationStats
