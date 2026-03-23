# Message

Type: class | Package: com.hypixel.hytale.server.core

public class Message

A rich text message supporting i18n translations, parameterized values, styling (bold, italic, monospace, underline, color), hyperlinks, and child message composition. Wraps the protocol-level `FormattedMessage` and provides a fluent builder API. Used throughout the server for chat messages, display names, and UI text.

## Factory Methods

- @Nonnull public static Message empty()
- @Nonnull public static Message translation(@Nonnull String messageId)
- @Nonnull public static Message raw(@Nonnull String message)
- @Nonnull public static Message parse(@Nonnull String message)
- @Nonnull public static Message join(@Nonnull Message... messages)

## Builder Methods

- @Nonnull public Message param(@Nonnull String key, @Nonnull String value)
- @Nonnull public Message param(@Nonnull String key, boolean value)
- @Nonnull public Message param(@Nonnull String key, double value)
- @Nonnull public Message param(@Nonnull String key, int value)
- @Nonnull public Message param(@Nonnull String key, long value)
- @Nonnull public Message param(@Nonnull String key, float value)
- @Nonnull public Message param(@Nonnull String key, @Nonnull Message formattedMessage)
- @Nonnull public Message bold(boolean bold)
- @Nonnull public Message italic(boolean italic)
- @Nonnull public Message monospace(boolean monospace)
- @Nonnull public Message color(@Nonnull String color)
- @Nonnull public Message color(@Nonnull Color color)
- @Nonnull public Message link(@Nonnull String url)
- @Nonnull public Message insert(@Nonnull Message formattedMessage)
- @Nonnull public Message insert(@Nonnull String message)
- @Nonnull public Message insertAll(@Nonnull Message... formattedMessages)
- @Nonnull public Message insertAll(@Nonnull List<Message> formattedMessages)

## Accessor Methods

- @Nullable public String getRawText()
- @Nullable public String getMessageId()
- @Nullable public String getColor()
- @Nonnull public List<Message> getChildren()
- @Nonnull public String getAnsiMessage()
- public FormattedMessage getFormattedMessage()

Also in this package: AuthMode, AuthModeConverter, Constants, Defaults, HytaleServer, HytaleServerConfig, LevelValueConverter, MaybeBoolCodec, Module, NameMatching, Options, ParamValueCodec, PathConverter, PathType, RecoveryMode, ShutdownReason, SocketAddressValueConverter, StringToPathMapConverter, TimeoutProfile, UUIDConverter

Complete API:
  public Message param(String key, String value)
  public Message param(String key, boolean value)
  public Message param(String key, double value)
  public Message param(String key, int value)
  public Message param(String key, long value)
  public Message param(String key, float value)
  public Message param(String key, Message formattedMessage)
  public Message bold(boolean bold)
  public Message italic(boolean italic)
  public Message monospace(boolean monospace)
  public Message color(String color)
  public Message color(Color color)
  public Message link(String url)
  public Message insert(Message formattedMessage)
  public Message insert(String message)
  public Message insertAll(Message formattedMessages)
  public Message insertAll(List<Message> formattedMessages)
  public String getRawText()
  public String getMessageId()
  public String getColor()
  public List<Message> getChildren()
  public String getAnsiMessage()
  public FormattedMessage getFormattedMessage()
  public String toString()
  public static Message empty()
  public static Message translation(String messageId)
  public static Message raw(String message)
  public static Message parse(String message)
  public static Message join(Message messages)

Fields:
private static final BuilderCodec.Builder<FormattedMessage> MESSAGE_CODEC_BUILDER
private static final BuilderCodec<FormattedMessage> MESSAGE_CODEC
private static final Codec<ParamValue> PARAM_CODEC
private static final Codec<MaybeBool> MAYBE_BOOL_CODEC
public static final FunctionCodec<FormattedMessage,Message> CODEC
private final FormattedMessage message
