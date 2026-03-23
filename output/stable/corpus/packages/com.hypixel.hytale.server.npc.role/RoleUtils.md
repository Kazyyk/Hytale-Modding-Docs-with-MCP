# RoleUtils

Type: class | Package: com.hypixel.hytale.server.npc.role

public class RoleUtils

Static utility methods for managing NPC inventory items during role initialization and runtime. Delegates to `InventoryHelper` for the actual item resolution and slot assignment. Logs warnings via `NPCPlugin` when item or armor resolution fails.

## Static Methods

- public static void setHotbarItems(@Nonnull NPCEntity npcComponent, @Nonnull String[] hotbarItems)
- public static void setOffHandItems(@Nonnull NPCEntity npcComponent, @Nonnull String[] offHandItems)
- public static void setItemInHand(@Nonnull NPCEntity npcComponent, @Nullable String itemInHand)
- public static void setArmor(@Nonnull NPCEntity npcComponent, @Nullable String armor)

Also in this package: AvoidanceMode, DeferredAction, Role, RoleDebugDisplay, RoleDebugFlags, RoleDebugPreset, SpawnEffect

Complete API:
  public static void setHotbarItems(NPCEntity npcComponent, String[] hotbarItems)
  public static void setOffHandItems(NPCEntity npcComponent, String[] offHandItems)
  public static void setItemInHand(NPCEntity npcComponent, String itemInHand)
  public static void setArmor(NPCEntity npcComponent, String armor)
