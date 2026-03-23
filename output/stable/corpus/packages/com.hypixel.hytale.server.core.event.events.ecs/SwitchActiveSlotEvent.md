# SwitchActiveSlotEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.ecs | Extends: CancellableEcsEvent

public class SwitchActiveSlotEvent extends CancellableEcsEvent

A cancellable ECS event fired when the corresponding SwitchActiveSlot action occurs.

## Fields

- private final int previousSlot
- private final int inventorySectionId
- private byte newSlot
- private final boolean serverRequest

## Methods

- public SwitchActiveSlotEvent(int inventorySectionId, int previousSlot, byte newSlot, boolean serverRequest)
- public int getPreviousSlot()
- public byte getNewSlot()
- public void setNewSlot(byte newSlot)
- public boolean isServerRequest()
- public boolean isClientRequest()
- public int getInventorySectionId()
