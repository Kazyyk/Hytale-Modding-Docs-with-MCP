# HudManager

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.hud

public class HudManager

## Fields

- private static final Set<HudComponent> DEFAULT_HUD_COMPONENTS
- private final Set<HudComponent> visibleHudComponents
- private final Set<HudComponent> unmodifiableVisibleHudComponents
- private CustomUIHud customHud

## Methods

- @Nullable public CustomUIHud getCustomHud()
- @Nonnull public Set<HudComponent> getVisibleHudComponents()
- public void setVisibleHudComponents(PlayerRef ref, HudComponent hudComponents)
- public void setVisibleHudComponents(PlayerRef ref, Set<HudComponent> hudComponents)
- public void showHudComponents(PlayerRef ref, HudComponent hudComponents)
- public void showHudComponents(PlayerRef ref, Set<HudComponent> hudComponents)
- public void hideHudComponents(PlayerRef ref, HudComponent hudComponents)
- public void setCustomHud(PlayerRef ref, CustomUIHud hud)
- public void resetHud(PlayerRef ref)
- public void resetUserInterface(PlayerRef ref)
- public void sendVisibleHudComponents(PacketHandler packetHandler)
- @Nonnull @Override public String toString()
