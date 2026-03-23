# ObjectiveHistoryComponent

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.components | Implements: Component

public class ObjectiveHistoryComponent implements Component<EntityStore>

ECS component stored in `EntityStore`. Serialized via `BuilderCodec`.

## Accessors

- getObjectiveHistoryMap() | Map<String, ObjectiveHistoryData> | Accessor method.
- getObjectiveLineHistoryMap() | Map<String, ObjectiveLineHistoryData> | Accessor method.

Complete API:
  public Map<String,ObjectiveHistoryData> getObjectiveHistoryMap()
  public Map<String,ObjectiveLineHistoryData> getObjectiveLineHistoryMap()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<ObjectiveHistoryComponent> CODEC
private Map<String,ObjectiveHistoryData> objectiveHistoryMap
private Map<String,ObjectiveLineHistoryData> objectiveLineHistoryMap
