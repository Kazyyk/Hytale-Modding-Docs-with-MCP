# IEventTitleReceiver

Type: interface | Package: com.hypixel.hytale.server.core.receiver

public interface IEventTitleReceiver

Utility type in the `receiver` subsystem.

## Abstract Methods

- showEventTitle | void | Message var1, Message var2, boolean var3, String var4, float var5, float var6, float var7
- hideEventTitle | void | float var1

Also in this package: IMessageReceiver, IPacketReceiver

Complete API:
  default void showEventTitle(Message primaryTitle, Message secondaryTitle, boolean isMajor, String icon)
  default void showEventTitle(Message primaryTitle, Message secondaryTitle, boolean isMajor, String icon, float duration)
  void showEventTitle(Message var1, Message var2, boolean var3, String var4, float var5, float var6, float var7)
  default void hideEventTitle()
  void hideEventTitle(float var1)

Fields:
float DEFAULT_DURATION
float DEFAULT_FADE_DURATION
