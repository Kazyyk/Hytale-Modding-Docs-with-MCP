# ItemAttitudeMap

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.attitude

public class ItemAttitudeMap

Provides ItemAttitudeMap functionality within the attitude subsystem.

## Fields

- private final Map<String, Attitude>[] map

## Methods

- private ItemAttitudeMap(Map<String, Attitude>[] map)
- @Nullable public Attitude getAttitude(@Nonnull NPCEntity parent, @Nullable ItemStack item)
- public int getAttitudeGroupCount()
- public void updateAttitudeGroup(int id, @Nonnull ItemAttitudeGroup group)
