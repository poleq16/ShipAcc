package file

import java.util.*

open class Line(val Data: Date, NrLP: String, OpłataNetto: Double, Waga: Double)
data class LineDhlPl(val Licznik: Int, val Data: Date, NrLP: String, OpłataNetto: Double, Waga: Double, val NrLP: String, val Typ: String, val Produkt: String, val Opis: String, val MPK: String, val Ilosc: String, val Waga: Double, val OplataNetto: Double, val KodVAT: String, val Zleceniodawca: String, val Placi: String, val Kodyuslug: String, val OdebralPrzes: String, val DataDOR: String, val GodzDOR: String, val NadNazwa: String, val NadUl: String, val NadNrDomu: String, val NadKod: String, val NadMiasto: String, val OdbNazwa: String, val OdbUl: String, val OdbNrDomu: String, val OdbKod: String, val OdbMiasto: String, val Uwagi: String) : Line(Data,NrLP,OplataNetto,Waga)
