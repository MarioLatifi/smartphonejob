enum class Range{
    HIGH,MEDIUM,LOW
}
enum class Type{
    MINI,NORMAL,MAX
}
class Smartphone(brandV:String,modelV:String,startingPriceV:Double,inchNumV:Double,ramQtyV:Double,touchScreenV:Boolean) {
    init{
        require(brandV.isNotBlank()){"Require Error.."}
        require(brandV.isNotEmpty()){"Require Error.."}
        require(modelV.isNotBlank()){"Require Error.."}
        require(modelV.isNotEmpty()){"Require Error.."}
        require(startingPriceV>0){"Require Error.."}
        require(inchNumV>0){"Require Error.."}
        require(ramQtyV>0){"Require Error.."}
    }
    var brand=brandV
        get(){
            return field
        }
        set(value){
            require(value.isNotBlank()){"Require Error.."}
            field=value
        }
    var model=modelV
        get(){
            return field
        }
        set(value){
            require(value.isNotBlank()){"Require Error.."}
            field=value
        }
    var startingPrice=startingPriceV
        get(){
            return field
        }
        set(value){
            require(value>0){"Require Error.."}
            field=value
        }
    var inchNum=inchNumV
        get(){
            return field
        }
        set(value){
            require(value>0){"Require Error.."}
            field=value
        }
    var ramQty=ramQtyV
        get(){
            return field
        }
        set(value){
            require(value>0){"Require Error.."}
            field=value
        }
    var touchScreen=touchScreenV
        get(){
            return field
        }
        set(value){
            field=value
        }
    fun getPriceRange():Range{
        var answer:Range=Range.HIGH
        when{
            startingPrice>500.0 -> answer= Range.HIGH
            startingPrice in 200.0..500.0 -> answer= Range.MEDIUM
            startingPrice<200.0 -> answer= Range.LOW
        }
        return answer
    }
    fun getSmartphoneType():Type{
        var answer:Type=Type.MINI
        when{
            inchNum>7.0 -> answer= Type.MAX
            inchNum in 5.0..7.0 -> answer= Type.NORMAL
            inchNum<5.0 -> answer= Type.MINI
        }
        return answer
    }
}