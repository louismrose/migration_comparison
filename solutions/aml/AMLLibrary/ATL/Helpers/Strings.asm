<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm name="0">
	<cp>
		<constant value="Strings"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="self"/>
		<constant value="matches"/>
		<constant value="S"/>
		<constant value="1"/>
		<constant value="J"/>
		<constant value="0"/>
		<constant value="J.toLower():J"/>
		<constant value="2"/>
		<constant value="3"/>
		<constant value="J.=(J):J"/>
		<constant value="18:22-18:26"/>
		<constant value="18:22-18:36"/>
		<constant value="19:23-19:28"/>
		<constant value="19:23-19:38"/>
		<constant value="20:2-20:6"/>
		<constant value="20:9-20:14"/>
		<constant value="20:2-20:14"/>
		<constant value="19:2-20:14"/>
		<constant value="18:2-20:14"/>
		<constant value="right"/>
		<constant value="left"/>
		<constant value="other"/>
		<constant value="simStrings"/>
		<constant value="J.matches(J):J"/>
		<constant value="8"/>
		<constant value="J.getStringSim(J):J"/>
		<constant value="9"/>
		<constant value="1.0"/>
		<constant value="23:5-23:9"/>
		<constant value="23:18-23:23"/>
		<constant value="23:5-23:24"/>
		<constant value="26:3-26:7"/>
		<constant value="26:21-26:26"/>
		<constant value="26:3-26:27"/>
		<constant value="24:3-24:6"/>
		<constant value="23:2-27:7"/>
	</cp>
	<operation name="1">
		<context type="2"/>
		<parameters>
		</parameters>
		<code>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="3" begin="0" end="-1"/>
		</localvariabletable>
	</operation>
	<operation name="4">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<load arg="8"/>
			<call arg="9"/>
			<store arg="10"/>
			<load arg="6"/>
			<call arg="9"/>
			<store arg="11"/>
			<load arg="10"/>
			<load arg="11"/>
			<call arg="12"/>
		</code>
		<linenumbertable>
			<lne id="13" begin="0" end="0"/>
			<lne id="14" begin="0" end="1"/>
			<lne id="15" begin="3" end="3"/>
			<lne id="16" begin="3" end="4"/>
			<lne id="17" begin="6" end="6"/>
			<lne id="18" begin="7" end="7"/>
			<lne id="19" begin="6" end="8"/>
			<lne id="20" begin="3" end="8"/>
			<lne id="21" begin="0" end="8"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="22" begin="5" end="8"/>
			<lve slot="2" name="23" begin="2" end="8"/>
			<lve slot="0" name="3" begin="0" end="8"/>
			<lve slot="1" name="24" begin="0" end="8"/>
		</localvariabletable>
	</operation>
	<operation name="25">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<load arg="8"/>
			<load arg="6"/>
			<call arg="26"/>
			<if arg="27"/>
			<load arg="8"/>
			<load arg="6"/>
			<call arg="28"/>
			<goto arg="29"/>
			<pushd arg="30"/>
		</code>
		<linenumbertable>
			<lne id="31" begin="0" end="0"/>
			<lne id="32" begin="1" end="1"/>
			<lne id="33" begin="0" end="2"/>
			<lne id="34" begin="4" end="4"/>
			<lne id="35" begin="5" end="5"/>
			<lne id="36" begin="4" end="6"/>
			<lne id="37" begin="8" end="8"/>
			<lne id="38" begin="0" end="8"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="3" begin="0" end="8"/>
			<lve slot="1" name="24" begin="0" end="8"/>
		</localvariabletable>
	</operation>
</asm>
